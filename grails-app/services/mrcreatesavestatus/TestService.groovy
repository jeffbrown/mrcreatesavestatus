package mrcreatesavestatus

import grails.gorm.services.Service

@Service(Test)
interface TestService {
    Test get(Serializable id)

    Test save(Boolean status)

    Test update(Serializable id, Boolean status)
}