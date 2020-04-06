package edu.upenn.cis350.irally.data

import edu.upenn.cis350.irally.data.model.Event
import edu.upenn.cis350.irally.data.model.LoggedInUser

class EventRepository {

    companion object {
        // in-memory cache of the loggedInUser object
        var events: MutableSet<Event> = mutableSetOf()
        // TODO: make this type event later
        var eventsCreatedByUser: MutableSet<String> = mutableSetOf()
    }
}