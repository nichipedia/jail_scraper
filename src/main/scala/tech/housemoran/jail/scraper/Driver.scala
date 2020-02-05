package tech.housemoran.jail.scraper


import tech.housemoran.models.InmateData.Inmate
import org.apache.logging.log4j.LogManager
import tech.housemoran.jail.scraper.states.la.StTammanyScraper
import tech.housemoran.models.InmateData

class Driver {
}

object Driver {
    val log = LogManager.getLogger(classOf[Driver])
    def main(args: Array[String]) {
        log.info("Welcome to Scraper!")            
        val stTammany = new StTammanyScraper
        for (inmate <- stTammany.getRecentInmates) {
            log.info(inmate.getSerializedSize())
        }
    }
}