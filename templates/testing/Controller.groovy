@artifact.package@
import spock.lang.Specification

import grails.testing.web.controllers.ControllerUnitTest

class @artifact.name@ControllerSpec extends Specification implements ControllerUnitTest<@artifact.name@Controller> {

    def setup() {
    }

    def cleanup() {
    }

    void 'test index'() {
        expect: 'fix me'
        true == false
    }

}
