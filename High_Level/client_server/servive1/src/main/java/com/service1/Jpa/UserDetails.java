// package com.service1.Jpa;



// // import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Index;
// import jakarta.persistence.SequenceGenerator;
// import jakarta.persistence.Table;
// import jakarta.persistence.UniqueConstraint;

// @Table(name = "USER_DETAILS",
//     uniqueConstraints = {
//         @UniqueConstraint(columnNames = "phone"),
//         @UniqueConstraint(columnNames = {"name","email"})
//     },
//     indexes = {
//         @Index(name = "index_phone",columnList = "phone"),
//         @Index(name = "index_name_email",columnList = "name,email")
//     }
// )
// @Entity
// public class UserDetails {
 
//     @Id
//     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unique_user_seq")
//     @SequenceGenerator(name = "unique_user_seq",sequenceName = "db_user_seq",initialValue = 100,allocationSize = 3)
//     private Long id;

//     // @Column(name = "full_name",unique = true,nullable = false,length = 255)
//     private String name;
//     private String email;
//     private String phone;
//     public UserDetails(Long id, String name, String email, String phone) {
//         this.id = id;
//         this.name = name;
//         this.email = email;
//         this.phone = phone;
//     }
//     public UserDetails() {
//     }
//     public Long getId() {
//         return id;
//     }
//     public void setId(Long id) {
//         this.id = id;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getEmail() {
//         return email;
//     }
//     public void setEmail(String email) {
//         this.email = email;
//     }
//     public String getPhone() {
//         return phone;
//     }
//     public void setPhone(String phone) {
//         this.phone = phone;
//     }

    

// }
