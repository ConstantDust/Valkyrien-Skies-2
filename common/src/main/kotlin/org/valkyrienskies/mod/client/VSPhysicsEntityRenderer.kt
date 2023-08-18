package org.valkyrienskies.mod.client

import com.mojang.blaze3d.vertex.PoseStack
import net.minecraft.client.renderer.MultiBufferSource
import net.minecraft.client.renderer.RenderType
import net.minecraft.client.renderer.entity.EntityRenderer
import net.minecraft.client.renderer.entity.EntityRendererProvider
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.inventory.InventoryMenu
import org.joml.Quaternionf
import org.valkyrienskies.mod.common.entity.VSPhysicsEntity

class VSPhysicsEntityRenderer(context: EntityRendererProvider.Context) :
    EntityRenderer<VSPhysicsEntity>(context) {

    private val model: VSTestEntityModel<VSPhysicsEntity>

    init {
        shadowRadius = 0.5f
        model = VSTestEntityModel(context.bakeLayer(VSTestEntityModel.LAYER_LOCATION))
    }

    override fun render(
        fallingBlockEntity: VSPhysicsEntity, f: Float, partialTick: Float, poseStack: PoseStack,
        multiBufferSource: MultiBufferSource, i: Int
    ) {

        poseStack.pushPose()
        poseStack.mulPose(Quaternionf(fallingBlockEntity.getRenderRotation(partialTick)))
        poseStack.translate(-0.5, -0.5, -0.5)
        val buffer = multiBufferSource.getBuffer(RenderType.cutout())

        model.renderToBuffer(poseStack, buffer, 1, 1, 1.0F, 1.0F, 1.0F, 1.0F)

        poseStack.popPose()
        super.render(fallingBlockEntity, f, partialTick, poseStack, multiBufferSource, i)
    }

    override fun getTextureLocation(entity: VSPhysicsEntity): ResourceLocation {
        return InventoryMenu.BLOCK_ATLAS
    }
}
