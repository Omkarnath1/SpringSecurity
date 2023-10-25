package com.example.JwtExample.Entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JwtResponse {


    private String jwtToken;
    private String username;

}
