import spock.lang.Specification

class CellTest extends Specification {
    def "a cell should exist"() {
        when: "a new cell is there"
        def cell = new SimpleCell()

        then: "cell is not living"
        !cell.isLiving()
        and: "cell has 8 neighbours"
        cell.getNeighbours().size() == 8
        and: "each neighbour is false"
        cell.getNeighbours() == [false, false, false, false, false, false, false, false]
    }
}
