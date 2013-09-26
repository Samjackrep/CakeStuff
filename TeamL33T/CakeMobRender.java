package CakeStuff.TeamL33T;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class CakeMobRender extends RenderLiving {
	private static final ResourceLocation field_110837_a = new ResourceLocation("CakeStuff:textures/mobs/CakeMonster.png");
	protected CakeMobModel model;
	public CakeMobRender(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((CakeMobModel)mainModel);
	}
	public void CakeMobRender (CakeMobEntity entity, double par2, double par4, double par6, float par8, float par9){
		super.doRenderLiving(entity, par2, par4, par6, par8, par9);
	}
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9){
		CakeMobRender((CakeMobEntity)par1EntityLiving, par2, par4, par6, par8, par9);
	}
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9){
		CakeMobRender((CakeMobEntity)par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		
		return field_110837_a;
	}

}
