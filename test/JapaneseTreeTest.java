import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JapaneseTreeTest {
    @Test
    void testCreation() {
        Tree tree1 = new JapaneseTree(100);

        assertTrue(tree1.clone() instanceof   Tree);
    }

    @Test
    void testAge() {
        Tree tree1 = new JapaneseTree(100);
        Tree tree2 = (Tree) tree1.clone();
        assertTrue(tree2.age ==  tree1.age);
    }

}