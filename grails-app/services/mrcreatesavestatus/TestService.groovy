package mrcreatesavestatus

import grails.gorm.services.Service

@Service(Test)
interface TestService {

    Test get(Serializable id)

    List<Test> list(Map args)

    Long count()

    void delete(Serializable id)

    Test save(Test test)

    Test save(Boolean status)

    Test update(Serializable id, Boolean status)
}