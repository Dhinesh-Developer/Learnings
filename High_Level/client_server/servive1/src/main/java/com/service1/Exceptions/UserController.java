// package com.service1.Exceptions;

// import java.util.Date;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping(value = "/api/")
// public class UserController {
    
//     @GetMapping(path = "/get-user")
//     public ResponseEntity<?> getUser(){
//        try{
//          throw new CustomException(HttpStatus.BAD_REQUEST,"request is not Correct, UserID is missing");
//        }catch(CustomException ex){
//         ErrorResponse response = new ErrorResponse(new Date(),ex.getMessage(),ex.geStatus().value());
//         return ResponseEntity.status(response.getStatus()).body(response);
//        }
//     }

//     @GetMapping(path = "/get-user-history")
//     public ResponseEntity<?> getUserHistory(){
//         throw new IllegalArgumentException("inappropriate arguments passed");
//     }

//     @GetMapping(path = "/get-user-data")
//     public String getUsers(){
//         throw new CustomException(HttpStatus.BAD_REQUEST,"request is not Correct, handled by global exception handler");
//     }

//     @ExceptionHandler(CustomException.class)
//     public ResponseEntity<?> handleCustomException(CustomException ex){
//         ErrorResponse response = new ErrorResponse(new Date(),ex.getMessage(),ex.geStatus().value());
//         return new ResponseEntity<>(response,ex.geStatus());
//     }

//     @ExceptionHandler(IllegalArgumentException.class)
//     public ResponseEntity<?> handleIllegalArgumentException(IllegalArgumentException ex){
//         ErrorResponse response = new ErrorResponse(new Date(),ex.getMessage(),HttpStatus.BAD_REQUEST.value());
//         return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
//     }

// }
