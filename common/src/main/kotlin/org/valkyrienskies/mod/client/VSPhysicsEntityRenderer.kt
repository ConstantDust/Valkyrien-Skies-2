package org.valkyrienskies.mod.client

import com.mojang.blaze3d.vertex.PoseStack
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.ItemBlockRenderTypes
import net.minecraft.client.renderer.MultiBufferSource
import net.minecraft.client.renderer.entity.EntityRenderer
import net.minecraft.client.renderer.entity.EntityRendererProvider
import net.minecraft.client.renderer.texture.OverlayTexture
import net.minecraft.core.BlockPos
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.inventory.InventoryMenu
import net.minecraft.world.level.block.RenderShape.INVISIBLE
import org.valkyrienskies.mod.common.ValkyrienSkiesMod
import org.valkyrienskies.mod.common.entity.VSPhysicsEntity
import net.minecraft.util.RandomSource
import org.joml.Quaternionf
import javax.swing.text.html.parser.DTDConstants.MODEL

class VSPhysicsEntityRenderer(context: EntityRendererProvider.Context) : EntityRenderer<VSPhysicsEntity>(context) {
    override fun render(
        fallingBlockEntity: VSPhysicsEntity, f: Float, partialTick: Float, poseStack: PoseStack,
        multiBufferSource: MultiBufferSource, i: Int
    ) {
        val blockState = ValkyrienSkiesMod.TEST_SPHERE.defaultBlockState()
        if (blockState.renderShape != MODEL) {
            return
        }
        val level = fallingBlockEntity.level()
        if (blockState === level.getBlockState(
                fallingBlockEntity.blockPosition()
            ) || blockState.renderShape == INVISIBLE
        ) {
            return
        }
        poseStack.pushPose()
        val blockPos = BlockPos.containing(fallingBlockEntity.x, fallingBlockEntity.boundingBox.maxY, fallingBlockEntity.z)
        poseStack.mulPose(Quaternionf(fallingBlockEntity.getRenderRotation(partialTick)))
        poseStack.translate(-0.5, -0.5, -0.5)
        val blockRenderDispatcher = Minecraft.getInstance().blockRenderer
        blockRenderDispatcher.modelRenderer.tesselateBlock(
            level, blockRenderDispatcher.getBlockModel(blockState), blockState, blockPos, poseStack,
            multiBufferSource.getBuffer(
                ItemBlockRenderTypes.getMovingBlockRenderType(blockState)
            ), false, RandomSource.create(), blockState.getSeed(BlockPos.ZERO), OverlayTexture.NO_OVERLAY
        )
        poseStack.popPose()
        super.render(fallingBlockEntity, f, partialTick, poseStack, multiBufferSource, i)
    }

    override fun getTextureLocation(entity: VSPhysicsEntity): ResourceLocation {
        return InventoryMenu.BLOCK_ATLAS
    }
}
