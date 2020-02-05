package tech.housemoran.jail.scraper.api

import tech.housemoran.models.InmateData.Inmate

trait JailScraper {
    def getRecentInmates: Iterable[Inmate]
    def getJailName: String
}