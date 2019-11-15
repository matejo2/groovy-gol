import spock.lang.Specification

class CellTest extends Specification {
    def "a cell should exist"() {
        when: "a new cell is there"
        def cell = new SimpleCell()

        then: "cell is not living"
        cell.living == false
        and: "cell has 8 neighbours"
        cell.neighbours.size() == 8
        and: "each neighbour is false"
        cell.neighbours == [false, false, false, false, false, false, false, false]
    }
}
