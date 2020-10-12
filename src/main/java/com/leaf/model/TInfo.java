package com.leaf.model;


import lombok.Data;

import java.io.Serializable;

@Data

public class TInfo implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String sex;

    private String tel;

}
