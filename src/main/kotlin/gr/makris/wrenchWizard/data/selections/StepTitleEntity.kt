package gr.makris.wrenchWizard.data.selections

import gr.makris.wrenchWizard.data.common.Model
import jakarta.persistence.*

@Entity
@Table(name = "steptitles")
data class StepTitleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "steptitleid", nullable = true)
    var stepTitleId: Int,

    @Column(name = "title", nullable = true)
    var title: String = Model.INVALID_STRING,

    @Column(name = "step", nullable = true)
    var step: Int = Model.INVALID_INT,

    @Column(name = "subcategoryid", nullable = true)
    var subCategoryId: Int = Model.INVALID_INT
)