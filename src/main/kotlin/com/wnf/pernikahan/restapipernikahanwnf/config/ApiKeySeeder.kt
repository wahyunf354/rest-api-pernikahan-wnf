package com.wnf.pernikahan.restapipernikahanwnf.config

import com.wnf.pernikahan.restapipernikahanwnf.entity.ApiKey
import com.wnf.pernikahan.restapipernikahanwnf.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(val apiKeyRepository: ApiKeyRepository) : ApplicationRunner {

    val apikey = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if(!apiKeyRepository.existsById(apikey)) {
            val entity = ApiKey(id=apikey)
            apiKeyRepository.save(entity)
        }
    }
}