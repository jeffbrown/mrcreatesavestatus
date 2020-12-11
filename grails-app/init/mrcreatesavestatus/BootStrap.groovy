package mrcreatesavestatus

class BootStrap {

    TestService testService
    def init = { servletContext ->
        // save a Test instance with
        // status set to false
        testService.save false
    }
    def destroy = {
    }
}
