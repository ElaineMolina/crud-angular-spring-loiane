package com.molina.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Course implements Serializable {
     private static final long serialVersionUID = 1l;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @JsonProperty("_id")
     private Long id;

     @NotBlank
     @NotNull
     @Length(min = 5, max = 200)
     @Column(length = 200, nullable = false)
     private String name;
 
     @NotNull
     @Length(max = 10)
     @Pattern(regexp = "back-end|front-end")
     @Column(length = 10, nullable = false)
     private String category;
     
}
