package com.example.RestdemoMain.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestdemoMain.Model.CloudVendor;

@RestController
@RequestMapping("/vendordetails")
public class CloudVendorAPIServices {
     CloudVendor cloudVendor;
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorID){
        return cloudVendor;
        // return new CloudVendor("C1","Name 1","Address 1","xx123");
    }
   @PostMapping
   public String postCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor=cloudVendor;
    return "Cloud Vendor added sucesfully";
   }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return"Cloud Vendor Updated Succesfully";
    }
    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(String  cloudVendor){
    this.cloudVendor=null;
    return "Cloud Vendor deleted sucesfully";
   }
}



