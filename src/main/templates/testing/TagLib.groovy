@artifact.package@
import spock.lang.Specification

import grails.testing.web.taglib.TagLibUnitTest

class @artifact.name@TagLibSpec extends Specification implements TagLibUnitTest<@artifact.name@TagLib> {

    def setup() {
    }

    def cleanup() {
    }

    void 'test tag'() {
        expect: 'fix me'
        true == false
    }

}
