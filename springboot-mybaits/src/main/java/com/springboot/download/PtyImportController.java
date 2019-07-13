package com.springboot.download;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PtyImportController {
	
	@GetMapping(value="/org/download")
	public ResponseEntity<byte[]> download() throws IOException{
		FileVo fileVo=new FileVo();
		FileOutputStream target=null;
		try(InputStream source=PtyImportController.class.getClassLoader().getResourceAsStream("download/组织机构快捷导入模板.xlsx")){
			File tempFile=File.createTempFile("cxgovac", "temp");
			target=new FileOutputStream(tempFile);
			IOUtils.copy(source, target);
			target.flush();
			target.close();
			fileVo.setFile(tempFile);
			fileVo.setFileName(URLEncoder.encode("组织机构快捷导入模板.xlsx", "UTF-8"));
			
			byte[] b=new byte[source.available()];
			source.read(b);
			
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + fileVo.getFileName() + "")
					.body(null);
		}finally {
			
		}
	}

}
