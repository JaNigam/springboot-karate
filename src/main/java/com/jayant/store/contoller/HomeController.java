package com.jayant.store.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//by adding @controller we are telling springboot to use this class as the controller class
@Controller
public class HomeController {

    private static Process streamlitProcess;

    @Value("${app.user-name}")  // Read from application.yml
    private String userName;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

//    @GetMapping("/streamlit")
//    public ResponseEntity<String> startStreamlit() {
//        try {
//            // Define the command to run the Streamlit app
//            String pythonExecutable = new ClassPathResource("streamlit/venv/Scripts/python.exe").getFile().getAbsolutePath();
//            String scriptPath = new ClassPathResource("streamlit/app.py").getFile().getAbsolutePath();
//
//
//            System.out.println("script path is--> "+scriptPath);
//            System.out.println("python exe file path --> "+pythonExecutable);
//            ProcessBuilder processBuilder = new ProcessBuilder(pythonExecutable, "-m", "streamlit", "run", scriptPath);
////            processBuilder.redirectErrorStream(true);
////            Process process = processBuilder.start();
//
//            processBuilder.redirectErrorStream(true);
//
//
//            Map<String, String> env = processBuilder.environment();
//            env.put("USER_NAME", userName); // Pass the name to Streamlit
//
//            streamlitProcess = processBuilder.start();
//            return ResponseEntity.ok("Streamlit app started successfully.");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to start Streamlit: " + e.getMessage());
//        }
//    }

//    @GetMapping("/stop-streamlit")
//    public ResponseEntity<String> stopStreamlit() {
//        if (streamlitProcess != null && streamlitProcess.isAlive()) {
//            streamlitProcess.destroy();
//            streamlitProcess = null;
//            return ResponseEntity.ok("Streamlit app stopped successfully.");
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No Streamlit process running.");
//    }


}
