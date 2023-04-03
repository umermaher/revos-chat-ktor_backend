package com.therevotech.data.message

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Message(
    val text: String,
    val attachment:String ?= null,
    val username: String,
    val avatar: String = "",
    val timestamp: Long,
    @BsonId val id: String = ObjectId().toString()
)