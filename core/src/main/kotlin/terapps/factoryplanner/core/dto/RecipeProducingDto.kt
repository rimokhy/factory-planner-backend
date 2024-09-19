package terapps.factoryplanner.core.dto

import terapps.factoryplanner.core.entities.CraftingMachine
import terapps.factoryplanner.core.projections.RecipeIO
import java.util.*

data class RecipeProducingDto(
        override val id: UUID,
        override val className: String,
        override val manufacturingDuration: Double,
        override val displayName: String,
        override val manufacturedIn: List<CraftingMachine>,
        val  producing: List<RecipeIoDto>
): RecipeDto(id, className, manufacturingDuration, displayName, manufacturedIn)


