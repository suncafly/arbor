package com.arbor.swagger2.event

import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-21 11:56 AM
 */
@Component
open class PersonEventProcessor {

    @Async
    @EventListener
    open fun handle(personEvent: PersonEvent<*>) {
        val person = personEvent.payload
        println(person)
        print(personEvent.status)
    }

}
