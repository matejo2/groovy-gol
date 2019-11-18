import spock.lang.Specification
import spock.lang.Unroll

class BoardLogicTest extends Specification {
    @Unroll
    def "new board with x = #width and y = #height exists"() {
        given: "a x size of #width"
        def xSize = width
        and: "a y size of #height"
        def ySize = height

        when: "a new Board is created with xSize and ySize"
        def board = new BoardLogic(xSize, ySize)

        then: "Board x size is #width"
        board.xSize == width

        and: "Board y size is #height"
        board.ySize == height

        where:
        width | height
        1     | 3
        4     | 2
        4     | 5
        4     | 2
        5     | 4
        5     | 0

    }

    def "new Board (3,3) with "() {
    }
}
