package com.router1011.atimemod2.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTreeTrunks extends ModelBase {
	ModelRenderer leg2;
	ModelRenderer trunk2;
	ModelRenderer trunk;
	ModelRenderer trunk1;
	ModelRenderer trunk3;
	ModelRenderer trunk4;
	ModelRenderer ear1;
	ModelRenderer tail7;
	ModelRenderer ear2;
	ModelRenderer tail4;
	ModelRenderer tail5;
	ModelRenderer tail6;
	ModelRenderer tail;
	ModelRenderer tail3;
	ModelRenderer tail2;
	ModelRenderer ear3;
	ModelRenderer ear5;
	ModelRenderer ear4;
	ModelRenderer leg1;
	ModelRenderer ear;
	ModelRenderer body6;
	ModelRenderer body2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body;
	ModelRenderer ribbon;
	ModelRenderer ribbon2;
	ModelRenderer ribbon3;
	ModelRenderer ribbon4;
	ModelRenderer ribbon5;
	ModelRenderer ribbon6;
	ModelRenderer ribbon7;
	ModelRenderer ribbon8;
	ModelRenderer ribbon10;
	ModelRenderer ribbon9;

	public ModelTreeTrunks() {
		textureWidth = 256;
		textureHeight = 128;

		leg2 = new ModelRenderer(this, 100, 50);
		leg2.addBox(-2F, 0F, -2F, 3, 4, 3);
		leg2.setRotationPoint(4F, 20F, 7F);
		leg2.setTextureSize(256, 128);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);
		trunk2 = new ModelRenderer(this, 100, 0);
		trunk2.addBox(0F, 0F, 0F, 2, 1, 2);
		trunk2.setRotationPoint(-1F, 16.2F, -10.5F);
		trunk2.setTextureSize(256, 128);
		trunk2.mirror = true;
		setRotation(trunk2, 0F, 0F, 0F);
		trunk = new ModelRenderer(this, 100, 0);
		trunk.addBox(0F, 0F, 0F, 2, 2, 1);
		trunk.setRotationPoint(-1F, 16F, -10F);
		trunk.setTextureSize(256, 128);
		trunk.mirror = true;
		setRotation(trunk, 0F, 0F, 0F);
		trunk1 = new ModelRenderer(this, 100, 0);
		trunk1.addBox(0F, 0F, 0F, 2, 5, 2);
		trunk1.setRotationPoint(-1F, 16.5F, -11.5F);
		trunk1.setTextureSize(256, 128);
		trunk1.mirror = true;
		setRotation(trunk1, 0F, 0F, 0F);
		trunk3 = new ModelRenderer(this, 100, 0);
		trunk3.addBox(0F, 0F, 0F, 1, 1, 2);
		trunk3.setRotationPoint(-1.5F, 21F, -11.5F);
		trunk3.setTextureSize(256, 128);
		trunk3.mirror = true;
		setRotation(trunk3, 0F, 0F, 0F);
		trunk4 = new ModelRenderer(this, 0, 0);
		trunk4.addBox(0F, 0F, 0F, 1, 1, 2);
		trunk4.setRotationPoint(0.5F, 21F, -11.5F);
		trunk4.setTextureSize(256, 128);
		trunk4.mirror = true;
		setRotation(trunk4, 0F, 0F, 0F);
		ear1 = new ModelRenderer(this, 50, 0);
		ear1.addBox(0F, 0F, 0F, 1, 2, 3);
		ear1.setRotationPoint(-5.8F, 14.7F, -6F);
		ear1.setTextureSize(256, 128);
		ear1.mirror = true;
		setRotation(ear1, 0F, 0F, 0.2443461F);
		tail7 = new ModelRenderer(this, 0, 0);
		tail7.addBox(0F, 0F, 0F, 3, 1, 1);
		tail7.setRotationPoint(-1.5F, 17F, 8.3F);
		tail7.setTextureSize(256, 128);
		tail7.mirror = true;
		setRotation(tail7, 0F, 0F, 0F);
		ear2 = new ModelRenderer(this, 50, 0);
		ear2.addBox(0F, 0F, 0F, 1, 1, 2);
		ear2.setRotationPoint(-5.8F, 14.7F, -2F);
		ear2.setTextureSize(256, 128);
		ear2.mirror = true;
		setRotation(ear2, 0F, 0F, 0.2443461F);
		tail4 = new ModelRenderer(this, 0, 100);
		tail4.addBox(0F, 0F, 0F, 2, 1, 1);
		tail4.setRotationPoint(-1F, 18F, 8.7F);
		tail4.setTextureSize(256, 128);
		tail4.mirror = true;
		setRotation(tail4, 0F, 0F, 0F);
		tail5 = new ModelRenderer(this, 0, 100);
		tail5.addBox(0F, 0F, 0F, 1, 1, 1);
		tail5.setRotationPoint(-0.5F, 19F, 8.5F);
		tail5.setTextureSize(256, 128);
		tail5.mirror = true;
		setRotation(tail5, 0F, 0F, 0F);
		tail6 = new ModelRenderer(this, 0, 100);
		tail6.addBox(0F, 0F, 0F, 2, 4, 1);
		tail6.setRotationPoint(-1F, 13.5F, 8.5F);
		tail6.setTextureSize(256, 128);
		tail6.mirror = true;
		setRotation(tail6, 0F, 0F, 0F);
		tail = new ModelRenderer(this, 0, 100);
		tail.addBox(0F, 0F, 0F, 2, 1, 1);
		tail.setRotationPoint(-1F, 13F, 8F);
		tail.setTextureSize(256, 128);
		tail.mirror = true;
		setRotation(tail, 0F, 0F, 0F);
		tail3 = new ModelRenderer(this, 0, 100);
		tail3.addBox(0F, 0F, 0F, 3, 1, 1);
		tail3.setRotationPoint(-1.5F, 17F, 8.7F);
		tail3.setTextureSize(256, 128);
		tail3.mirror = true;
		setRotation(tail3, 0F, 0F, 0F);
		tail2 = new ModelRenderer(this, 0, 100);
		tail2.addBox(0F, 0F, 0F, 2, 1, 1);
		tail2.setRotationPoint(-1F, 18F, 8.3F);
		tail2.setTextureSize(256, 128);
		tail2.mirror = true;
		setRotation(tail2, 0F, 0F, 0F);
		ear3 = new ModelRenderer(this, 50, 0);
		ear3.addBox(0F, 0F, 0F, 1, 4, 6);
		ear3.setRotationPoint(3.9F, 11.2F, -6F);
		ear3.setTextureSize(256, 128);
		ear3.mirror = true;
		setRotation(ear3, 0F, 0F, -0.2268928F);
		ear5 = new ModelRenderer(this, 50, 0);
		ear5.addBox(0F, 0F, 0F, 1, 1, 2);
		ear5.setRotationPoint(4.8F, 15F, -2F);
		ear5.setTextureSize(256, 128);
		ear5.mirror = true;
		setRotation(ear5, 0F, 0F, -0.2443461F);
		ear4 = new ModelRenderer(this, 50, 0);
		ear4.addBox(0F, 0F, 0F, 1, 2, 3);
		ear4.setRotationPoint(4.8F, 15F, -6F);
		ear4.setTextureSize(256, 128);
		ear4.mirror = true;
		setRotation(ear4, 0F, 0F, -0.2443461F);
		leg1 = new ModelRenderer(this, 100, 50);
		leg1.addBox(-2F, 0F, -2F, 3, 4, 3);
		leg1.setRotationPoint(-3F, 20F, 7F);
		leg1.setTextureSize(256, 128);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0F);
		ear = new ModelRenderer(this, 50, 0);
		ear.addBox(0F, 0F, 0F, 1, 4, 6);
		ear.setRotationPoint(-4.9F, 11F, -6F);
		ear.setTextureSize(256, 128);
		ear.mirror = true;
		setRotation(ear, 0F, 0F, 0.2443461F);
		body6 = new ModelRenderer(this, 200, 100);
		body6.addBox(0F, 0F, 0F, 9, 16, 1);
		body6.setRotationPoint(-4.5F, 13F, -8.5F);
		body6.setTextureSize(256, 128);
		body6.mirror = true;
		setRotation(body6, 1.570796F, 0F, 0F);
		body2 = new ModelRenderer(this, 150, 50);
		body2.addBox(0F, 0F, 0F, 9, 17, 3);
		body2.setRotationPoint(-4.7F, 16F, -9F);
		body2.setTextureSize(256, 128);
		body2.mirror = true;
		setRotation(body2, 1.570796F, 0F, 0F);
		leg3 = new ModelRenderer(this, 100, 50);
		leg3.addBox(-2F, 18F, -2F, 3, 4, 3);
		leg3.setRotationPoint(-3F, 2F, -6F);
		leg3.setTextureSize(256, 128);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0F);
		leg4 = new ModelRenderer(this, 100, 50);
		leg4.addBox(-2F, 0F, -2F, 3, 4, 3);
		leg4.setRotationPoint(4F, 20F, -6F);
		leg4.setTextureSize(256, 128);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, 0F);
		body3 = new ModelRenderer(this, 150, 8);
		body3.addBox(0F, 0F, 0F, 9, 16, 1);
		body3.setRotationPoint(-4.5F, 13F, -8F);
		body3.setTextureSize(256, 128);
		body3.mirror = true;
		setRotation(body3, 1.570796F, 0F, 0F);
		body4 = new ModelRenderer(this, 200, 0);
		body4.addBox(0F, 0F, 0F, 9, 17, 3);
		body4.setRotationPoint(-4.3F, 16F, -9F);
		body4.setTextureSize(256, 128);
		body4.mirror = true;
		setRotation(body4, 1.570796F, 0F, 0F);
		body5 = new ModelRenderer(this, 200, 50);
		body5.addBox(0F, 0F, 0F, 8, 16, 1);
		body5.setRotationPoint(-4F, 12F, -8F);
		body5.setTextureSize(256, 128);
		body5.mirror = true;
		setRotation(body5, 1.570796F, 0F, 0F);
		body = new ModelRenderer(this, 150, 100);
		body.addBox(-5F, -10F, -7F, 10, 17, 4);
		body.setRotationPoint(0F, 13F, 1F);
		body.setTextureSize(256, 128);
		body.mirror = true;
		setRotation(body, 1.570796F, 0F, 0F);
		ribbon = new ModelRenderer(this, 100, 100);
		ribbon.addBox(0F, 0F, 0F, 2, 1, 1);
		ribbon.setRotationPoint(-1F, 16F, 8.2F);
		ribbon.setTextureSize(256, 128);
		ribbon.mirror = true;
		setRotation(ribbon, 0F, 0F, 0F);
		ribbon2 = new ModelRenderer(this, 100, 100);
		ribbon2.addBox(0F, 0F, 0F, 2, 1, 1);
		ribbon2.setRotationPoint(-1F, 16F, 8.8F);
		ribbon2.setTextureSize(256, 128);
		ribbon2.mirror = true;
		setRotation(ribbon2, 0F, 0F, 0F);
		ribbon3 = new ModelRenderer(this, 100, 100);
		ribbon3.addBox(0F, 0F, 0F, 1, 1, 1);
		ribbon3.setRotationPoint(0.2F, 16F, 8.5F);
		ribbon3.setTextureSize(256, 128);
		ribbon3.mirror = true;
		setRotation(ribbon3, 0F, 0F, 0F);
		ribbon4 = new ModelRenderer(this, 100, 100);
		ribbon4.addBox(0F, 0F, 0F, 1, 1, 1);
		ribbon4.setRotationPoint(-1.2F, 16F, 8.466666F);
		ribbon4.setTextureSize(256, 128);
		ribbon4.mirror = true;
		setRotation(ribbon4, 0F, 0F, 0F);
		ribbon5 = new ModelRenderer(this, 100, 100);
		ribbon5.addBox(0F, 0F, 0F, 1, 2, 1);
		ribbon5.setRotationPoint(0.8F, 15.5F, 9F);
		ribbon5.setTextureSize(256, 128);
		ribbon5.mirror = true;
		setRotation(ribbon5, 0F, 0F, 0F);
		ribbon6 = new ModelRenderer(this, 100, 100);
		ribbon6.addBox(0F, 0F, 0F, 1, 2, 1);
		ribbon6.setRotationPoint(-1.8F, 15.5F, 9F);
		ribbon6.setTextureSize(256, 128);
		ribbon6.mirror = true;
		setRotation(ribbon6, 0F, 0F, 0F);
		ribbon7 = new ModelRenderer(this, 100, 100);
		ribbon7.addBox(0F, 0F, 0F, 1, 1, 1);
		ribbon7.setRotationPoint(-2.3F, 15F, 9.3F);
		ribbon7.setTextureSize(256, 128);
		ribbon7.mirror = true;
		setRotation(ribbon7, 0F, 0F, 0F);
		ribbon8 = new ModelRenderer(this, 100, 100);
		ribbon8.addBox(0F, 0F, 0F, 1, 1, 1);
		ribbon8.setRotationPoint(1.3F, 15F, 9.3F);
		ribbon8.setTextureSize(256, 128);
		ribbon8.mirror = true;
		setRotation(ribbon8, 0F, 0F, 0F);
		ribbon10 = new ModelRenderer(this, 100, 100);
		ribbon10.addBox(0F, 0F, 0F, 1, 1, 1);
		ribbon10.setRotationPoint(-2.3F, 17F, 9.3F);
		ribbon10.setTextureSize(256, 128);
		ribbon10.mirror = true;
		setRotation(ribbon10, 0F, 0F, 0F);
		ribbon9 = new ModelRenderer(this, 100, 100);
		ribbon9.addBox(0F, 0F, 0F, 1, 1, 1);
		ribbon9.setRotationPoint(1.3F, 17F, 9.3F);
		ribbon9.setTextureSize(256, 128);
		ribbon9.mirror = true;
		setRotation(ribbon9, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		leg2.render(f5);
		trunk2.render(f5);
		trunk.render(f5);
		trunk1.render(f5);
		trunk3.render(f5);
		trunk4.render(f5);
		ear1.render(f5);
		tail7.render(f5);
		ear2.render(f5);
		tail4.render(f5);
		tail5.render(f5);
		tail6.render(f5);
		tail.render(f5);
		tail3.render(f5);
		tail2.render(f5);
		ear3.render(f5);
		ear5.render(f5);
		ear4.render(f5);
		leg1.render(f5);
		ear.render(f5);
		body6.render(f5);
		body2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		body3.render(f5);
		body4.render(f5);
		body5.render(f5);
		body.render(f5);
		ribbon.render(f5);
		ribbon2.render(f5);
		ribbon3.render(f5);
		ribbon4.render(f5);
		ribbon5.render(f5);
		ribbon6.render(f5);
		ribbon7.render(f5);
		ribbon8.render(f5);
		ribbon10.render(f5);
		ribbon9.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}