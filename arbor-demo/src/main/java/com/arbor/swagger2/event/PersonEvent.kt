package com.arbor.swagger2.event

import org.mvnsearch.ddd.domain.annotations.DomainEvent
import org.mvnsearch.ddd.domain.events.BaseDomainEvent

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-21 11:56 AM
 */
@DomainEvent
class PersonEvent<T> : BaseDomainEvent<T>() {
    var status: Int? = null
}
