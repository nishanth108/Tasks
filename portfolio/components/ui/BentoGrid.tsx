'use client'
import { cn } from "@/lib/utils";
import { useState } from "react";
import { MagicButton } from "../MagicButton";
import { BackgroundGradientAnimation } from "./GradientBg";
import { GlobeDemo } from "./GridGlobe";
import animationData from "@/data/confetti.json";
import Lottie from 'react-lottie';
import { IoCopyOutline } from "react-icons/io5";

export const BentoGrid = ({
  className,
  children,
}: {
  className?: string;
  children?: React.ReactNode;
}) => {
  return (
    <div
      className={cn(
        "grid grid-cols-1 md:grid-cols-6 lg:grid-cols-5 md:grid-rows-7 gap-4 lg:gap-8 max-w-7xl mx-auto",
        className
      )}
    >
      {children}
    </div>
  );
};

export const BentoGridItem = ({
  className,
  id,
  title,
  description,
  img,
  imgClassName,
  titleClassName,
  spareImg,
}: {
  className?: string;
  id: number;
  title?: string | React.ReactNode;
  description?: string | React.ReactNode;
  img?: string;
  imgClassName?: string;
  titleClassName?: string;
  spareImg?: string;
}) => {
  const [copied, setCopied] = useState(false);
  const handleCopy = () => {
    const text = "hsu@jsmastery.pro";
    navigator.clipboard.writeText(text);
    setCopied(true);
  };

  return (
    <div
      className={cn(
        "row-span-1 relative overflow-hidden rounded-3xl border border-white/[0.1] group/bento hover:shadow-xl transition duration-200 shadow-input dark:shadow-none justify-between flex flex-col",
        className
      )}
      style={{
        background: 'linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(99,99,129,1) 35%, rgba(114,134,138,1) 47%)',
      }}
    >
      {img && (
        <div className={`${id === 6 ? "flex justify-center h-full" : ""}`}>
          <div className="w-full h-full absolute">
            <img
              src={img}
              alt={img}
              className={cn(imgClassName, 'object-cover object-center')}
            />
          </div>
        </div>
      )}

      {spareImg && id === 5 && (
        <div className="absolute right-0 -bottom-5 w-full opacity-80">
          <img
            src={spareImg}
            alt={spareImg}
            className="object-cover object-center w-full h-full"
          />
        </div>
      )}

      {id === 6 && (
        <BackgroundGradientAnimation>
          <div className="absolute z-50 inset-0 flex items-center justify-center text-white font-bold px-4 pointer-events-none text-3xl text-center md:text-4xl lg:text-7xl"></div>
        </BackgroundGradientAnimation>
      )}

      <div
        className={cn(
          titleClassName,
          'group-hover/bento:translate-x-2 transition duration-200 relative md:h-full min-h-40 flex flex-col px-5 p-5 lg:p-10'
        )}
      >
        {description && (
          <div className="font-sans font-extralight text-[#c1c2d3] text-sm md:text-xs lg:text-base z-10">
            {description}
          </div>
        )}
        {title && (
          <div className="font-sans font-bold text-lg lg:text-3xl max-w-96 z-10">
            {title}
          </div>
        )}

        {id === 2 && <GlobeDemo />}

        {id === 3 && (
          <div className="flex gap-1 lg:gap-5 w-fit absolute -right-3 lg:-right-2">
            {['React.js', 'Next.js', 'TypeScript'].map((item) => (
              <div key={item} className="flex flex-col gap-3 lg:gap-8">
                <span
                  className="py-2 lg:py-4 lg:px-3 text-xs lg:text-base opacity-50 lg:opacity-100 rounded-lg text-center bg-[#10132E]"
                >
                  {item}
                </span>
              </div>
            ))}
          </div>
        )}

        {id === 6 && (
          <div className="mt-5 relative">
            <div className={`absolute -bottom-5 right-0`}>
              <Lottie
                options={{
                  loop: copied,
                  autoplay: copied,
                  animationData,
                  rendererSetting: {
                    preserveAspectRatio: 'xMidMid slice',
                  }  
                }}
              />
            </div>

            <MagicButton 
                title= {copied ? 'Email copied' : 'Copy my email' }
                icon = {<IoCopyOutline />}
                position="left"
                Otherclass="!bg-[#161a31]"
                handClick={handleCopy}
                
               /> 

          </div>
        )}
      </div>
    </div>
  );
};
