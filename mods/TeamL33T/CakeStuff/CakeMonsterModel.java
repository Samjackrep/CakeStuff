package CakeStuff.mods.TeamL33T.CakeStuff;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CakeMonsterModel extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Left_Leg;
    ModelRenderer Right_Leg;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
  
  public CakeMonsterModel()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(128, 128);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 16, 8);
      Body.addBox(-4F, 0F, -2F, 8, 12, 12);
      Body.setRotationPoint(0F, 0F, -4F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Left_Leg = new ModelRenderer(this, 0, 16);
      Left_Leg.addBox(-2F, 0F, -2F, 4, 12, 4);
      Left_Leg.setRotationPoint(0F, 12F, -4F);
      Left_Leg.setTextureSize(128, 128);
      Left_Leg.mirror = true;
      setRotation(Left_Leg, 0F, 0F, 0F);
      Right_Leg = new ModelRenderer(this, 0, 16);
      Right_Leg.addBox(0F, 0F, 0F, 4, 12, 4);
      Right_Leg.setRotationPoint(-2F, 12F, 2F);
      Right_Leg.setTextureSize(128, 128);
      Right_Leg.mirror = true;
      setRotation(Right_Leg, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape2.setRotationPoint(0F, 0F, 0F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape3.setRotationPoint(0F, 0F, 0F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Head.render(par7);
    Body.render(par7);
    Left_Leg.render(par7);
    Right_Leg.render(par7);
    Shape1.render(par7);
    Shape2.render(par7);
    Shape3.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, float par7Entity)
  {
	  
  }

}
