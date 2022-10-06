package JakubGaj;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = Optional.ofNullable(blocks).orElse(List.of());
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
       return this.blocks.stream()
                .filter(block->block.getColor().equals(color))
                .findAny();

    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return this.blocks.stream()
                .filter(block->block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return this.blocks.size();
    }
}