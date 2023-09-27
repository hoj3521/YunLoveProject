
  package com.basic.controller;
  
  import java.util.List; import java.util.Map;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.http.HttpStatus; import
  org.springframework.web.bind.annotation.DeleteMapping; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.PathVariable; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.PutMapping; import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RequestParam; import
  org.springframework.web.bind.annotation.ResponseBody; import
  org.springframework.web.servlet.ModelAndView;
  
  import com.basic.service.BbsService; import com.basic.service.CreatorService;
  
  public class LogController {
  
  @Autowired private LogService logService;
  
  @GetMapping("Log") public ModelAndView SelectListLog(@RequestParam LogDTO
  dto) { List<LogDTO> LogList = LogService.SelectListLog(dto); ModelAndView mv
  = new ModelAndView(); mv.setViewName("LogList");
  mv.setStatus(HttpStatus.valueOf(200)); mv.addObject("Log", LogList); return
  mv; 
  }
  
 } 
  

  
 