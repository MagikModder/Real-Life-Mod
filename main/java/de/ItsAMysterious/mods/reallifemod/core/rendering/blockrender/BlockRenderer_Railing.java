package de.ItsAMysterious.mods.reallifemod.core.rendering.blockrender;

import static org.lwjgl.opengl.GL11.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import de.ItsAMysterious.mods.reallifemod.TLMBlocks;
import de.ItsAMysterious.mods.reallifemod.core.tiles.railingTE;

public class BlockRenderer_Railing implements ISimpleBlockRenderingHandler{

	final int renderID;
	private final railingTE tileBlastFurnace=new railingTE();
	
	public BlockRenderer_Railing(int var1){
		renderID=var1;
	}
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId,RenderBlocks renderer) {
		glPushMatrix();
        glRotatef(180F, 0.0F, 1.0F, 0.0F);
        glTranslatef(-0.5F, -0.5F, -0.5F);
        doRender(block, metadata, modelId);
        	glEnable(32826);
        glPopMatrix();
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,Block block, int modelId, RenderBlocks renderer) {
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}

	@Override
	public int getRenderId() {
		return renderID;
	}
	
	public void doRender(Block block,int par0,float par2){
        if(block == TLMBlocks.railing)
            TileEntityRendererDispatcher.instance.renderTileEntityAt(tileBlastFurnace, 0.0D, 0.0D, 0.0D, 0.0F);
	}

}
