package ru.steelwave.unotes.domain.useCases.report

import ru.steelwave.unotes.domain.entity.ReportModel
import ru.steelwave.unotes.domain.repository.ReportRepository

class SendReportUseCase(private val repository: ReportRepository) {

    suspend operator fun invoke(report: ReportModel){
        repository.sendReport(report)
    }

}