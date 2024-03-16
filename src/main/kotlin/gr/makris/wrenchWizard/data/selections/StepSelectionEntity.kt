package gr.makris.wrenchWizard.data.selections

import gr.makris.wrenchWizard.data.common.Model
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "stepselections")
data class StepSelectionEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stepselectionid", nullable = true)
    var stepSelectionId: Int,

    @Column(name = "name", nullable = true)
    var name: String = Model.INVALID_STRING,

    @Column(name = "steptitleid", nullable = true)
    var stepTitleId: Int = Model.INVALID_INT,

    @Column(name = "subcategoryid", nullable = true)
    var subcategoryId: Int = Model.INVALID_INT
)