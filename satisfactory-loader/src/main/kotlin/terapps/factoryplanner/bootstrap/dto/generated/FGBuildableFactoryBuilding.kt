package terapps.factoryplanner.bootstrap.dto.generated

import terapps.factoryplanner.bootstrap.dto.GameEntity

data class FGBuildableFactoryBuilding(
        val `ClassName`: String,
        val `MaxRenderDistance`: String,
        val `bForceBuildEffectSolo`: String,
        val `bForceLegacyBuildEffect`: String,
        val `mAffectsOcclusion`: String,
        val `mAlienOverClockingAttenuationScalingFactor`: Double,
        val `mAlienOverClockingHighpass_RTPC`: Double,
        val `mAlienOverClockingPitch_RTPC`: Double,
        val `mAlienOverClockingVolumeDB_RTPC`: Double,
        val `mAlienOverClockingZOffset`: Double,
        val `mAllowColoring`: String,
        val `mAllowPatterning`: String,
        val `mAlternativeMaterialRecipes`: String,
        val `mAttachmentPoints`: String,
        val `mBlueprintBuildEffectID`: String,
        val `mBuildEffectSpeed`: Double,
        val `mCanContainLightweightInstances`: String,
        val `mClearanceData`: String,
        val `mContainsComponents`: String,
        val `mCustomScaleType`: String,
        val `mDescription`: String,
        val `mDisplayName`: String,
        val `mForceNetUpdateOnRegisterPlayer`: String,
        val `mHasBeenRemovedFromSubsystem`: String,
        val `mHideOnBuildEffectStart`: String,
        val `mInteractingPlayers`: String,
        val `mInteractionRegisterPlayerWithCircuit`: String,
        val `mIsConsideredForBaseWeightValue`: Double,
        val `mIsMultiSpawnedBuildable`: String,
        val `mIsUseable`: String,
        val `mManagedByLightweightBuildableSubsystem`: String,
        val `mOcclusionBoxInfo`: String,
        val `mOcclusionShape`: String,
        val `mRemoveBuildableFromSubsystemOnDismantle`: String,
        val `mReplicatedBuiltInsideBlueprintDesigner`: String,
        val `mScaleCustomOffset`: Double,
        val `mShouldModifyWorldGrid`: String,
        val `mShouldShowAttachmentPointVisuals`: String,
        val `mSkipBuildEffect`: String,
        val `mTimelapseBucketId`: Int,
        val `mTimelapseDelay`: Double,
        val `mToggleDormancyOnInteraction`: String
) : GameEntity()
    