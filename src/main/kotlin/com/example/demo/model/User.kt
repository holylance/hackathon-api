package com.example.demo.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigInteger
import java.time.ZonedDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "h_user")
data class User(
    @Id
    @JsonProperty("id")
    val id: BigInteger,

    @JsonProperty("uuid")
    @Column(name = "uuid")
    val uuid: UUID,

    @JsonProperty("full_name")
    @Column(name = "full_name")
    val fullName: String,

    @JsonProperty("phone_number")
    @Column(name = "phone_number")
    val phoneNumber: String,

    @JsonProperty("email")
    @Column(name = "email")
    val email: String,

    @JsonProperty("password")
    @Column(name = "password")
    val password: String,

    @JsonProperty("description")
    @Column(name = "description")
    val description: String,

    @JsonProperty("created_date")
    @Column(name = "created_date")
    val createdDate: String,

    @JsonProperty("updated_date")
    @Column(name = "updated_date")
    val updatedDate: ZonedDateTime
)
