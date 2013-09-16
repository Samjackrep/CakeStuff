package CakeStuff.mods.TeamL33T.CakeStuff;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class CakeOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		}
	}
	
	private void generateEnd(World world, Random random, int i, int j) {}

	private void generateNether(World world, Random random, int i, int j) {}

	private void generateSurface(World world, Random random, int i, int j) {
		for(int k = 0; k < 35; k++) {
	        int cakeOreXCoord = i + random.nextInt(16);
	        int cakeOreYCoord = random.nextInt(31);// + 70 (idk);
	        int cakeOreZCoord = j + random.nextInt(16);
	        new WorldGenMinable(CakeStuffID.CakeOre, 4).generate(world, random, cakeOreXCoord, cakeOreYCoord, cakeOreZCoord);
		}
	}


}
