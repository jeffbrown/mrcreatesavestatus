package mrcreatesavestatus

class TestController {

    TestService testService

    def updateStatusTrue(Long id) {
        respond testService.update(id, true)
    }

    def updateStatusFalse(Long id) {
        respond testService.update(id, false)
    }

    def show(Long id) {
        respond testService.get(id)
    }
}
