package com.gwi.demo.repository

import com.gwi.demo.model.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {
}