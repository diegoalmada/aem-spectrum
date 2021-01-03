import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
import {Button as ButtonSpectrum} from '@adobe/react-spectrum'

type Props = any;

const ButtonEditConfig = {
  emptyLabel: 'Button',
  isEmpty(props:Props) {
    return !props?.text || props.text.trim().length < 1;
  },
};

const Button = ({ text, accessibilityLabel, style }:Props) => 
    text ? <ButtonSpectrum aria-label={accessibilityLabel} isQuiet={style?.quiet} variant={style?.variant}>{text}</ButtonSpectrum>:null

export default MapTo('aem-spectrum/components/content/button')
(Button, ButtonEditConfig);
