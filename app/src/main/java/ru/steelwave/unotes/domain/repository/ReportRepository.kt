package ru.steelwave.unotes.domain.repository

import ru.steelwave.unotes.domain.entity.ReportModel

interface ReportRepository {

    suspend fun sendReport(report: ReportModel)

}