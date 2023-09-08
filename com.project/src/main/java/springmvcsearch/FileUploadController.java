package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
   
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
		
	}
	@RequestMapping(value="/uploadimage",method=RequestMethod.POST)
	public String fileupload(@RequestParam("profile")CommonsMultipartFile file ) {
		System.out.println("file upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		
		//we have to save this file to server
		return "filesuccess";
	}
	
}
