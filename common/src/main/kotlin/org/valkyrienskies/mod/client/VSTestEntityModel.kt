package org.valkyrienskies.mod.client

import com.mojang.blaze3d.vertex.PoseStack
import com.mojang.blaze3d.vertex.VertexConsumer
import net.minecraft.client.model.EntityModel
import net.minecraft.client.model.geom.ModelLayerLocation
import net.minecraft.client.model.geom.ModelPart
import net.minecraft.client.model.geom.PartPose
import net.minecraft.client.model.geom.builders.CubeDeformation
import net.minecraft.client.model.geom.builders.CubeListBuilder
import net.minecraft.client.model.geom.builders.LayerDefinition
import net.minecraft.client.model.geom.builders.MeshDefinition
import net.minecraft.client.model.geom.builders.PartDefinition
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.Entity
import org.valkyrienskies.mod.common.ValkyrienSkiesMod

class VSTestEntityModel<T : Entity?>(modelPart: ModelPart) : EntityModel<T>() {

    private var elsphero: ModelPart? = null

    init {
        elsphero = modelPart.getChild("elsphero")
    }

    fun createBodyLayer(): LayerDefinition? {
        val meshdefinition = MeshDefinition()
        val partdefinition: PartDefinition = meshdefinition.getRoot()
        val elsphero: PartDefinition = partdefinition.addOrReplaceChild(
            "elsphero", CubeListBuilder.create().texOffs(0, 0)
                .addBox(-5.0f, -5.0f, -5.0f, 10.0f, 10.0f, 10.0f, CubeDeformation(0.0f)),
            PartPose.offset(0.0f, 16.0f, 0.0f)
        )
        val south: PartDefinition = elsphero.addOrReplaceChild(
            "south",
            CubeListBuilder.create().texOffs(35, 67).addBox(-2.0f, -2.0f, 7.0f, 1.0f, 4.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(10, 57).addBox(-1.0f, -3.0f, 7.0f, 2.0f, 6.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(16, 43).addBox(-1.0f, -5.0f, 6.0f, 2.0f, 10.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(10, 30).addBox(-2.0f, -5.0f, 5.0f, 4.0f, 10.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(50, 0).addBox(-6.0f, -2.0f, 5.0f, 4.0f, 4.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(50, 0).mirror().addBox(2.0f, -2.0f, 5.0f, 4.0f, 4.0f, 1.0f, CubeDeformation(0.0f))
                .mirror(false)
                .texOffs(66, 13).addBox(-5.0f, 2.0f, 5.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(66, 10).addBox(2.0f, 2.0f, 5.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(71, 53).addBox(2.0f, 4.0f, 5.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(70, 29).addBox(-4.0f, 4.0f, 5.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(66, 34).addBox(-4.0f, -5.0f, 5.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(30, 62).addBox(2.0f, -5.0f, 5.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(65, 47).addBox(2.0f, -4.0f, 5.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(65, 0).addBox(-5.0f, -4.0f, 5.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(52, 56).addBox(1.0f, -1.0f, 6.0f, 4.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(64, 61).addBox(1.0f, 1.0f, 6.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(64, 54).addBox(1.0f, -3.0f, 6.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(49, 64).addBox(-4.0f, 1.0f, 6.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(61, 24).addBox(-3.0f, 3.0f, 6.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(58, 33).addBox(-3.0f, -4.0f, 6.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(42, 23).addBox(1.0f, -4.0f, 6.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(25, 30).addBox(1.0f, 3.0f, 6.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(41, 64).addBox(-4.0f, -3.0f, 6.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(56, 49).addBox(-5.0f, -1.0f, 6.0f, 4.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(6, 0).addBox(2.0f, -1.0f, 7.0f, 1.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(0, 0).addBox(-3.0f, -1.0f, 7.0f, 1.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(0, 67).addBox(1.0f, -2.0f, 7.0f, 1.0f, 4.0f, 1.0f, CubeDeformation(0.0f)),
            PartPose.offset(0.0f, 0.0f, 0.0f)
        )
        val north: PartDefinition = elsphero.addOrReplaceChild(
            "north", CubeListBuilder.create().texOffs(38, 28)
                .addBox(-2.0f, -5.0f, -6.0f, 4.0f, 10.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(22, 43).addBox(-1.0f, -5.0f, -7.0f, 2.0f, 10.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(73, 9).addBox(-4.0f, 4.0f, -6.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(7, 73).addBox(-3.0f, 3.0f, -7.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(27, 67).addBox(-5.0f, 2.0f, -6.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(67, 26).addBox(-4.0f, 1.0f, -7.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(46, 50).addBox(-6.0f, -2.0f, -6.0f, 4.0f, 4.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(31, 59).addBox(-5.0f, -1.0f, -7.0f, 4.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(67, 23).addBox(-4.0f, -3.0f, -7.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(67, 19).addBox(-5.0f, -4.0f, -6.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(69, 72).addBox(-4.0f, -5.0f, -6.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(72, 67).addBox(-3.0f, -4.0f, -7.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(55, 72).addBox(2.0f, -5.0f, -6.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(72, 46).addBox(1.0f, -4.0f, -7.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(10, 67).addBox(1.0f, -3.0f, -7.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(64, 66).addBox(2.0f, -4.0f, -6.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(50, 40).addBox(2.0f, -2.0f, -6.0f, 4.0f, 4.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(58, 21).addBox(1.0f, -1.0f, -7.0f, 4.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(56, 66).addBox(2.0f, 2.0f, -6.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(66, 31).addBox(1.0f, 1.0f, -7.0f, 3.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(36, 72).addBox(2.0f, 4.0f, -6.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(71, 65).addBox(1.0f, 3.0f, -7.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(0, 59).addBox(-1.0f, -3.0f, -8.0f, 2.0f, 6.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(43, 67).addBox(-2.0f, -2.0f, -8.0f, 1.0f, 4.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(0, 25).addBox(-3.0f, -1.0f, -8.0f, 1.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(0, 20).addBox(2.0f, -1.0f, -8.0f, 1.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(39, 67).addBox(1.0f, -2.0f, -8.0f, 1.0f, 4.0f, 1.0f, CubeDeformation(0.0f)),
            PartPose.offset(0.0f, 0.0f, 0.0f)
        )
        val east: PartDefinition = elsphero.addOrReplaceChild(
            "east", CubeListBuilder.create().texOffs(32, 71)
                .addBox(-8.0f, -2.0f, -2.0f, 1.0f, 4.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(17, 54).addBox(-8.0f, -3.0f, -1.0f, 1.0f, 6.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(30, 42).addBox(-7.0f, -5.0f, -1.0f, 1.0f, 10.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(0, 30).addBox(-6.0f, -5.0f, -2.0f, 1.0f, 10.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(64, 38).addBox(-6.0f, -2.0f, -5.0f, 1.0f, 4.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(25, 61).addBox(-6.0f, 2.0f, -5.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(61, 33).addBox(-6.0f, 2.0f, 2.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(69, 69).addBox(-6.0f, 4.0f, 2.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(8, 70).addBox(-6.0f, 4.0f, -4.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(20, 70).addBox(-6.0f, -5.0f, -4.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(26, 70).addBox(-6.0f, -5.0f, 2.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(59, 61).addBox(-6.0f, -4.0f, 2.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(13, 62).addBox(-6.0f, -4.0f, -5.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(20, 30).addBox(-6.0f, -2.0f, 2.0f, 1.0f, 4.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(20, 30).mirror().addBox(5.0f, -2.0f, 2.0f, 1.0f, 4.0f, 3.0f, CubeDeformation(0.0f))
                .mirror(false)
                .texOffs(48, 25).addBox(-7.0f, -1.0f, 1.0f, 1.0f, 2.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(62, 26).addBox(-7.0f, 1.0f, 1.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(33, 62).addBox(-7.0f, -3.0f, 1.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(3, 63).addBox(-7.0f, 1.0f, -4.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(70, 39).addBox(-7.0f, 3.0f, -3.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(45, 70).addBox(-7.0f, -4.0f, -3.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(70, 62).addBox(-7.0f, -4.0f, 1.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(2, 71).addBox(-7.0f, 3.0f, 1.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(63, 5).addBox(-7.0f, -3.0f, -4.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(36, 49).addBox(-7.0f, -1.0f, -5.0f, 1.0f, 2.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(30, 5).addBox(-8.0f, -1.0f, 2.0f, 1.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(6, 30).addBox(-8.0f, -1.0f, -3.0f, 1.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(14, 71).addBox(-8.0f, -2.0f, 1.0f, 1.0f, 4.0f, 1.0f, CubeDeformation(0.0f)),
            PartPose.offset(0.0f, 0.0f, 0.0f)
        )
        val west: PartDefinition = elsphero.addOrReplaceChild(
            "west", CubeListBuilder.create().texOffs(28, 28)
                .addBox(5.0f, -5.0f, -2.0f, 1.0f, 10.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(10, 41).addBox(6.0f, -5.0f, -1.0f, 1.0f, 10.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(68, 3).addBox(5.0f, 4.0f, -4.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(4, 68).addBox(6.0f, 3.0f, -3.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(20, 59).addBox(5.0f, 2.0f, -5.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(38, 59).addBox(6.0f, 1.0f, -4.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(21, 64).addBox(5.0f, -2.0f, -5.0f, 1.0f, 4.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(0, 44).addBox(6.0f, -1.0f, -5.0f, 1.0f, 2.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(59, 42).addBox(6.0f, -3.0f, -4.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(46, 59).addBox(5.0f, -4.0f, -5.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(16, 68).addBox(5.0f, -5.0f, -4.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(68, 36).addBox(6.0f, -4.0f, -3.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(51, 68).addBox(5.0f, -5.0f, 2.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(69, 16).addBox(6.0f, -4.0f, 1.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(54, 59).addBox(6.0f, -3.0f, 1.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(59, 56).addBox(5.0f, -4.0f, 2.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(48, 19).addBox(6.0f, -1.0f, 1.0f, 1.0f, 2.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(60, 0).addBox(5.0f, 2.0f, 2.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(61, 14).addBox(6.0f, 1.0f, 1.0f, 1.0f, 2.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(69, 50).addBox(5.0f, 4.0f, 2.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(55, 69).addBox(6.0f, 3.0f, 1.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(26, 52).addBox(7.0f, -3.0f, -1.0f, 1.0f, 6.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(61, 69).addBox(7.0f, -2.0f, -2.0f, 1.0f, 4.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(0, 30).addBox(7.0f, -1.0f, -3.0f, 1.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(30, 0).addBox(7.0f, -1.0f, 2.0f, 1.0f, 2.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(65, 69).addBox(7.0f, -2.0f, 1.0f, 1.0f, 4.0f, 1.0f, CubeDeformation(0.0f)),
            PartPose.offset(0.0f, 0.0f, 0.0f)
        )
        val down: PartDefinition = elsphero.addOrReplaceChild(
            "down", CubeListBuilder.create().texOffs(60, 52)
                .addBox(-10.0f, -1.0f, 6.0f, 4.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(40, 13).addBox(-11.0f, -1.0f, 7.0f, 6.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(28, 25).addBox(-13.0f, -2.0f, 7.0f, 10.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(0, 25).addBox(-14.0f, -3.0f, 6.0f, 12.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(34, 39).addBox(-10.0f, -3.0f, 2.0f, 4.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(0, 55).addBox(-6.0f, -3.0f, 3.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(54, 35).addBox(-6.0f, -3.0f, 10.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(71, 55).addBox(-4.0f, -3.0f, 10.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(49, 71).addBox(-4.0f, -3.0f, 4.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(71, 6).addBox(-13.0f, -3.0f, 4.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(71, 42).addBox(-13.0f, -3.0f, 10.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(54, 17).addBox(-12.0f, -3.0f, 10.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(54, 25).addBox(-12.0f, -3.0f, 3.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(16, 38).addBox(-10.0f, -3.0f, 10.0f, 4.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(46, 35).addBox(-9.0f, -2.0f, 9.0f, 2.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(56, 9).addBox(-7.0f, -2.0f, 9.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(42, 55).addBox(-11.0f, -2.0f, 9.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(32, 55).addBox(-7.0f, -2.0f, 4.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(72, 35).addBox(-5.0f, -2.0f, 5.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(72, 32).addBox(-12.0f, -2.0f, 5.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(71, 58).addBox(-12.0f, -2.0f, 9.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(72, 1).addBox(-5.0f, -2.0f, 9.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(55, 29).addBox(-11.0f, -2.0f, 4.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(44, 45).addBox(-9.0f, -2.0f, 3.0f, 2.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(24, 73).addBox(-9.0f, -1.0f, 10.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(18, 73).addBox(-9.0f, -1.0f, 5.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(47, 17).addBox(-10.0f, -1.0f, 9.0f, 4.0f, 1.0f, 1.0f, CubeDeformation(0.0f)),
            PartPose.offset(8.0f, 8.0f, -8.0f)
        )
        val up: PartDefinition = elsphero.addOrReplaceChild(
            "up", CubeListBuilder.create().texOffs(32, 23)
                .addBox(-10.0f, -16.0f, 6.0f, 4.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(40, 10).addBox(-11.0f, -16.0f, 7.0f, 6.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(28, 20).addBox(-13.0f, -15.0f, 7.0f, 10.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(0, 20).addBox(-14.0f, -14.0f, 6.0f, 12.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(30, 5).addBox(-10.0f, -14.0f, 2.0f, 4.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(53, 52).addBox(-6.0f, -14.0f, 3.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(53, 13).addBox(-6.0f, -14.0f, 10.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(67, 57).addBox(-4.0f, -14.0f, 10.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(47, 67).addBox(-4.0f, -14.0f, 4.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(67, 44).addBox(-13.0f, -14.0f, 4.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(60, 5).addBox(-13.0f, -14.0f, 10.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(7, 53).addBox(-12.0f, -14.0f, 10.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(53, 5).addBox(-12.0f, -14.0f, 3.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(30, 0).addBox(-10.0f, -14.0f, 10.0f, 4.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(36, 44).addBox(-9.0f, -15.0f, 9.0f, 2.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(52, 45).addBox(-7.0f, -15.0f, 9.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(48, 31).addBox(-11.0f, -15.0f, 9.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(46, 6).addBox(-7.0f, -15.0f, 4.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(51, 59).addBox(-5.0f, -15.0f, 5.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(43, 59).addBox(-12.0f, -15.0f, 5.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(39, 55).addBox(-12.0f, -15.0f, 9.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(42, 6).addBox(-5.0f, -15.0f, 9.0f, 1.0f, 1.0f, 2.0f, CubeDeformation(0.0f))
                .texOffs(40, 16).addBox(-11.0f, -15.0f, 4.0f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f))
                .texOffs(42, 1).addBox(-9.0f, -15.0f, 3.0f, 2.0f, 1.0f, 4.0f, CubeDeformation(0.0f))
                .texOffs(73, 15).addBox(-9.0f, -16.0f, 10.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(73, 12).addBox(-9.0f, -16.0f, 5.0f, 2.0f, 1.0f, 1.0f, CubeDeformation(0.0f))
                .texOffs(0, 8).addBox(-10.0f, -16.0f, 9.0f, 4.0f, 1.0f, 1.0f, CubeDeformation(0.0f)),
            PartPose.offset(8.0f, 8.0f, -8.0f)
        )
        return LayerDefinition.create(meshdefinition, 128, 128)
    }


    override fun renderToBuffer(
        poseStack: PoseStack, vertexConsumer: VertexConsumer, packedLight: Int, packedOverlay: Int, red: Float,
        green: Float, blue: Float, alpha: Float
    ) {
        elsphero?.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha)
    }

    override fun setupAnim(entity: T, f: Float, g: Float, h: Float, i: Float, j: Float) {

    }

    companion object {
        // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
        val LAYER_LOCATION: ModelLayerLocation = ModelLayerLocation(ResourceLocation(ValkyrienSkiesMod.MOD_ID, "elsphero"), "up")
    }

}
