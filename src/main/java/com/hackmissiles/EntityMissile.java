package com.hackmissiles;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

// Simplified missile entity skeleton - implement flight and explosion logic here
public class EntityMissile extends Entity {
    private int lifetime = 0;
    private BlockPos target;

    public EntityMissile(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    public void tick() {
        super.tick();
        lifetime++;
        if (world.isRemote) return;
        if (target != null) {
            // move towards target - stubbed
            Vector3d pos = this.getPositionVec();
            Vector3d dir = new Vector3d(target.getX() - pos.x, target.getY() - pos.y, target.getZ() - pos.z);
            double len = Math.sqrt(dir.x*dir.x + dir.y*dir.y + dir.z*dir.z);
            if (len > 1.0) {
                this.setMotion(dir.scale(0.2 / len));
            } else {
                explode();
            }
        }
        if (lifetime > 200) explode();
    }

    public void setTarget(BlockPos t) {
        this.target = t;
    }

    private void explode() {
        if (world.isRemote) return;
        // simple explosion - replace with sophisticated logic (destroy obsidian conditional)
        world.createExplosion(this, this.getPosX(), this.getPosY(), this.getPosZ(), 4.0f, true);
        this.remove();
    }

    @Override
    protected void registerData() {}

    @Override
    protected void readAdditional(net.minecraft.nbt.CompoundNBT compound) {}

    @Override
    protected void writeAdditional(net.minecraft.nbt.CompoundNBT compound) {}
}
