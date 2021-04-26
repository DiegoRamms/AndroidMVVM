package com.diego.nodefrontend.utils

interface Mapper<Entity, ModelDomain> {

    fun fromModel(model: ModelDomain ): Entity

    fun toModel(entity: Entity): ModelDomain

}