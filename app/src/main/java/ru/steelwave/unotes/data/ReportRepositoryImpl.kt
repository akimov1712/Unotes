package ru.steelwave.unotes.data

import ru.steelwave.unotes.domain.entity.ReportModel
import ru.steelwave.unotes.domain.repository.ReportRepository

object ReportRepositoryImpl: ReportRepository {

    override suspend fun sendReport(report: ReportModel) {
        TODO("Not yet implemented")
    }
}