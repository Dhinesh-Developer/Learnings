package com.service1.Annotations;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service1.entity.ProductEntity;

@RestController
@RequestMapping("/test")
public class AnnotationController {
    
    @GetMapping("/greet")
    public String greetings(){
        return "Hello from Annotations Example by dk!!";
    }

    // @GetMapping("/product")
    // public ProductEntity getProducts(){
    //     return new ProductEntity(1,"Laptop","This the Mac Laptop!!");
    // }

    // RequestMapping - Base URL

    @PostMapping("/save")
    public String saveEmployee(){
        return "Employee Saved!!";
    }

    // RequestParam -> Form values in paramater we can use (name or value)

    @GetMapping("/search")
    public String search(@RequestParam(name = "name") String name){
        return "Name : "+name;
    }

    @GetMapping("/add")
    public int add(@RequestParam(name = "a") int a,
                    @RequestParam(value = "b") int b){
        return a+b;
    }

    // path variable- > used to get values from URL path
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id){
        return "USER ID: "+id;
    }

    // ResponseEntity -> custom HTTP resposne,status code control,Headers control

    @GetMapping("/student")
    public ResponseEntity<String> getStudent(){
        return ResponseEntity.status(HttpStatus.OK).body("Dhinesh");
    }

    // Not Found Response
    @GetMapping("/product/{id}")
    public ResponseEntity<String> getProduct(@PathVariable int id){
        if(id == 0){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).header("token", "kumar").body("Invlaid id");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Product Found!!");
    }

    // RequestBody() -> Used to accepet json data, post request body

    @PostMapping("/product")
    public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductEntity productEntity){
        ProductEntity product = new ProductEntity();
        product.setId(productEntity.getId());
        product.setName(productEntity.getName());
        product.setDescription(productEntity.getDescription());
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
    

}
