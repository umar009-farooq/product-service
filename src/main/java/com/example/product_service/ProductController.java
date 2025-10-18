package com.example.product_service;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    /**
     * This endpoint is for ANY authenticated user (USER or ADMIN).
     * The gateway will check for a valid token.
     */
    @GetMapping
    public String getAllProducts() {
        // In a real app, you'd fetch from a database.
        return "List of [Product1, Product2, Product3]. (Accessible to all users)";
    }

    /**
     * This endpoint is ONLY for ADMINS.
     * The gateway will check for a valid token AND the 'ROLE_ADMIN' role.
     */
    @PostMapping
    public String createProduct(@RequestBody String productJson) {
        // In a real app, you'd save this to a database.
        return "CREATED new product: " + productJson + ". (ADMIN access only)";
    }
}