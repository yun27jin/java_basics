package com.yun27jin.lambda.eighth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member {
    private String name;
    private String id;
    private Address address;
}
