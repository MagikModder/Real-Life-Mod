package de.ItsAMysterious.mods.reallifemod.api.Renderer.BlockRenderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import de.ItsAMysterious.mods.reallifemod.TLMBlocks;
import de.ItsAMysterious.mods.reallifemod.core.rendering.TileEntitys.pissoirTE;

public class BlockRenderer_Pissoir implements ISimpleBlockRenderingHandler{
	int renderID;
	pissoirTE tile=new pissoirTE();
	
	public BlockRenderer_Pissoir(int var1){
		renderID=var1;
	}
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId,
			RenderBlocks renderer) {
    	GL11.glScalef(1.0F, 1.0F, 1.0F);
        GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 0.5F);
        render(block, metadata, modelId);
        GL11.glEnable(32826);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
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
	
	public void render(Block block,int var1,float var2){
		if(block == TLMBlocks.pissoir)
            TileEntityRendererDispatcher.instance.renderTileEntityAt(tile, 0.0D, 0.0D, -0.5D, 0.0F);
	}

}