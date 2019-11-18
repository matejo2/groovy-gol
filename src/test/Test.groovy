import spock.lang.Specification
import spock.lang.Unroll

class Test extends Specification {

    @Unroll
    def "a living cell with #livingNeighbours living neighbours returns #expectedState"() {
        given: "a living cell"
        def cell = new SimpleCell(true, livingNeighbours)

        when: "cell has #livingNeighbours living neighbours"
        cell.livingNeighbours == livingNeighbours

        then: "cell gets next generation state"
        cell.nextGenerationState() == expectedState

        where:
        livingNeighbours | expectedState
        0                | false
        1                | false
        2                | true
        3                | true
        4                | false
        5                | false
        6                | false
        7                | false
        8                | false
    }

    @Unroll
    def "a dead cell with #livingNeighbours living neighbours returns #expectedState"() {
        given: "a living cell"
        def cell = new SimpleCell(false, livingNeighbours)

        when: "cell has #livingNeighbours living neighbours"
        cell.livingNeighbours == livingNeighbours

        then: "cell gets next generation state"
        cell.nextGenerationState() == expectedState

        where:
        livingNeighbours | expectedState
        0                | false
        1                | false
        2                | false
        3                | true
        4                | false
        5                | false
        6                | false
        7                | false
        8                | false
    }

}
